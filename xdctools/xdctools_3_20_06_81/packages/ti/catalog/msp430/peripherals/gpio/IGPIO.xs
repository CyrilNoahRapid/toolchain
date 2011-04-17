var IGPIO;
var iGPIO;
var GetSet;

/*
 *  ======== module$meta$init ========
 */
function module$meta$init()
{
	// Store handle for current module
    IGPIO = this;
    
    // Get handle to getter/setter service
    GetSet = xdc.module("xdc.services.getset.GetSet");
}

/*
 *  ======== module$validate ========
 */
function module$validate() 
{
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init()
{
	// Store handle for current instance
	iGPIO = this;
	
	// Activate getter/setter support on current instance
    GetSet.init(this);
}

/*
 *  ======== instance_validate ========
 */
function instance_validate(inst)
{
}

/*
 *  ======== findPinsForFunction ========
 */
function findPinsForFunction(regExp) 
{
	// Create a new instance of our module-defined return type
	var returnValue = new IGPIO.MatchedPortFunction_t;

	// Iterate through the device pin "database", indentify all matching pins,
	// and compile them into a data structure
	for (var port in iGPIO.devicePins) {
		for (var pin in iGPIO.devicePins[port]) {
			for (var func in iGPIO.devicePins[port][pin].pinFunction.functionName) {
				var functionName = iGPIO.devicePins[port][pin].pinFunction.functionName[func];
				
				// Check if regular expression returns a match
				if (functionName.search(regExp) > -1) {
					returnValue.port.$add(Number(port));
					returnValue.pin.$add(Number(pin));
					returnValue.pinName.$add(iGPIO.devicePins[port][pin].pinName);
					returnValue.functionIndex.$add(Number(func));
					returnValue.functionName.$add(functionName);
				}
			}
		}
	}
	
	return returnValue;
}

/*
 *  ======== pinFunctionIsActive ========
 */
function pinFunctionIsActive(port, pin, regExp)
{
	// Sanitize input parameters
	port = Number(port);
	pin = Number(pin);

	for (var func in iGPIO.devicePins[port][pin].pinFunction.functionName) {
		var functionName = iGPIO.devicePins[port][pin].pinFunction.functionName[func];
		
		// Check if regular expression returns a match
		if (functionName.search(regExp) > -1) {
			return true;
		}
	}	
	
	return false;
}

/*
 *  ======== getPinFunctionIndex ========
 */
function getPinFunctionIndex(port, pin)
{
	// Sanitize input parameters
	port = Number(port);
	pin = Number(pin);

	// Return functional index
	return iGPIO.devicePinSetting[port][pin].functionIndex;
}

/*
 *  ======== getPinOwner ========
 */
function getPinOwner(port, pin)
{
	// Sanitize input parameters
	port = Number(port);
	pin = Number(pin);

	// Return current owner
	return iGPIO.devicePinSetting[port][pin].owner;
}

/*
 *  ======== setPinFunctionUsingIndex ========
 */
function setPinFunctionUsingIndex(port, pin, index, owner)
{
	// Sanitize input parameters
	port = Number(port);
	pin = Number(pin);
	index = Number(index);

	// Check if it is ok to assign a new pin function
	if ((iGPIO.devicePinSetting[port][pin].owner != undefined) &&
		 (iGPIO.devicePinSetting[port][pin].owner != owner))
	{
		// TODO: Remove debug print code	
		print("setPinFunctionUsingIndex: Ownership conflict!");
		print("port = " + port + " pin = " + pin + " func = " + index + " current owner = " +
			iGPIO.devicePinSetting[port][pin].owner + " new owner = " +
			owner);
			
		throw new Error("Can't assign new function to P" + (port + 1) + "." + pin +
			"  because of " + String(this.devicePinSetting[port][pin].owner).match(/[\w\d]+$/));
	}

	// In order to change the functionIndex without triggering any setter reaction
	// avoiding possibly unwanted side effects, we make a temporary assignment to owner
	// that can be used in a setter function to decide whether to take action on the
	// programmatically induced change or not.
	iGPIO.devicePinSetting[port][pin].owner = "API";	
	iGPIO.devicePinSetting[port][pin].functionIndex = index;
	iGPIO.devicePinSetting[port][pin].owner = owner;
}

/*
 *  ======== setDefaultPinFunction ========
 */
function setDefaultPinFunction(port, pin, owner)
{
	// Sanitize input parameters
	port = Number(port);
	pin = Number(pin);

	// Check if it is ok to assign a new pin function
	if ((iGPIO.devicePinSetting[port][pin].owner != undefined) &&
		 (iGPIO.devicePinSetting[port][pin].owner != owner))
	{
		// TODO: Remove debug print code
		print("setDefaultPinFunction: Ownership conflict!");
		print("port = " + port + " pin = " + pin + " current owner = " +
			iGPIO.devicePinSetting[port][pin].owner + " new owner = undefined");

		throw new Error("Can't assign default function to P" + (port + 1) + "." + pin +
			"  because of " + String(this.devicePinSetting[port][pin].owner).match(/[\w\d]+$/));
	}

	// In order to change the functionIndex without triggering any setter reaction
	// avoiding possibly unwanted side effects, we make a temporary assignment to owner
	// that can be used in a setter function to decide whether to take action on the
	// programmatically induced change or not.
	iGPIO.devicePinSetting[port][pin].owner = "API";
	iGPIO.devicePinSetting[port][pin].functionIndex = 0;
	iGPIO.devicePinSetting[port][pin].owner = undefined;	
}
