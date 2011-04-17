/*!
 * Universal Serial Communication Interface
 */
metaonly module USCI_A1_UART_2xx inherits IUSCI_A0_UART {

instance:
	/*! Determine if each Register needs to be forced set or not */
	readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
	[
		{ register : "UCA1CTL0"   , regForceSet : false },
		{ register : "UCA1CTL1"   , regForceSet : false },
		{ register : "UCA1BR0"    , regForceSet : false },
		{ register : "UCA1BR1"    , regForceSet : false },
		{ register : "UCA1MCTL"   , regForceSet : false },
		{ register : "UCA1STAT"   , regForceSet : false },
		{ register : "UCA1RXBUF"  , regForceSet : false },
		{ register : "UCA1TXBUF"  , regForceSet : false },
		{ register : "UCA1ABCTL"  , regForceSet : false },
		{ register : "UCA1IRTCTL" , regForceSet : false },
		{ register : "UCA1IRRCTL" , regForceSet : false }
	];
}
