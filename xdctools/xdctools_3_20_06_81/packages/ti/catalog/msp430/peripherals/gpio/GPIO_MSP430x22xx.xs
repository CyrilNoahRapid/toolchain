var IMod;

/*
 *  ======== module$meta$init ========
 */
function module$meta$init()
{
	/* Store a reference to the module and call super's initializer */
    IMod = this.$super;
    IMod.module$meta$init.$apply(this, []);
}

/*
 *  ======== instance$meta$init ========
 */
function instance$meta$init(adc10) 
{
	/* Call super's initializer */
    IMod.instance$meta$init.$apply(this, []);

	/* Initialize this config */
    this.adc10 = adc10;
}
