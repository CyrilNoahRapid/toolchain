/*!
 *  ======== Flash_2xx ========
 *  MSP430 Flash 2xx
 */
metaonly module Flash_2xx inherits IFlash {

    /* FCTL1 Register */
    struct FCTL1_t {
        FWKEY_t     FWKEY;                  /*! FCTLx password */
        BLKWRT_t    BLKWRT;                 /*! Block write mode */
        WRT_t       WRT;                    /*! Write */
        EEIEX_t     EEIEX;                  /*! Enable Emergency Interrupt Exit */
        EEI_t       EEI;                    /*! Enable Erase Interrupts */
        MERAS_t     MERAS;                  /*! Mass erase */
        ERASE_t     ERASE;                  /*! Erase */
    }
    
    /* FCTL2 Register */
    struct FCTL2_t {
        FWKEY_t     FWKEY;                  /*! FCTLx password */
        FSSEL_t     FSSEL;                  /*! Flash controller clock source select */
        FN5_t       FN5;                    /*! Flash controller clock divider bit 5 */
        FN4_t       FN4;                    /*! Flash controller clock divider bit 4 */
        FN3_t       FN3;                    /*! Flash controller clock divider bit 3 */
        FN3_t       FN2;                    /*! Flash controller clock divider bit 2 */
        FN1_t       FN1;                    /*! Flash controller clock divider bit 1 */
        FN0_t       FN0;                    /*! Flash controller clock divider bit 0 */
    }
    
    /* FCTL3 Register */
    struct FCTL3_t {
        FWKEY_t     FWKEY;                  /*! FCTLx password. Always read as 096h. Must be written as 0A5h or a PUC
                                             *  will be generated. */
        FAIL_t      FAIL;                   /*!  FAIL Bit 7 Operation failure. This bit is set if the fFTG clock source fails, or a flash
                                             *  operation is aborted from an interrupt when EEIEX = 1. FAIL must be reset
                                             *  with software.
                                             *  0  No failure
                                             *  1  Failure */
        LOCKA_t     LOCKA;                  /*! SegmentA and Info lock. Write a 1 to this bit to change its state. Writing 0 has
                                             *  no effect.
                                             *  0  Segment A unlocked and all information memory is erased during a
                                             *     mass erase.
                                             *  1  Segment A locked and all information memory is protected from erasure
                                             *     during a mass erase. */
        EMEX_t      EMEX;                   /*! Emergency exit
                                             *  0  No emergency exit
                                             *  1  Emergency exit */
        LOCK_t      LOCK;                   /*! Lock. This bit unlocks the flash memory for writing or erasing. The LOCK bit
                                             *  can be set anytime during a byte/word write or erase operation and the
                                             *  operation will complete normally. In the block write mode if the LOCK bit is set
                                             *  while BLKWRT=WAIT=1, then BLKWRT and WAIT are reset and the mode
                                             *  ends normally.
                                             *  0  Unlocked
                                             *  1  Locked */
        WAIT_t      WAIT;                   /*! Wait. Indicates the flash memory is being written to.
                                             *  0  The flash memory is not ready for the next byte/word write
                                             *  1  The flash memory is ready for the next byte/word write */
        ACCVIFG_t   ACCVIFG;                /*! Access violation interrupt flag
                                             *  0 No interrupt pending
                                             *  1 Interrupt pending */
        KEYV_t      KEYV;                   /*! Flash security key violation. This bit indicates an incorrect FCTLx password
                                             *  was written to any flash control register and generates a PUC when set. KEYV
                                             *  must be reset with software.
                                             *  0  FCTLx password was written correctly
                                             *  1  FCTLx password was written incorrectly */
        BUSY_t      BUSY;                   /*! Busy. This bit indicates the status of the flash timing generator.
                                             *  0  Not Busy
                                             *  1  Busy */
    }
    
instance:
    /*! Flash Memory Control Register 1 */
    config FCTL1_t FCTL1 = {
        FWKEY   : FWKEY,
        BLKWRT  : BLKWRT_OFF,    
        WRT     : WRT_OFF,          
        EEIEX   : EEIEX_OFF, 
        EEI     : EEI_OFF,       
        MERAS   : MERAS_OFF,
        ERASE   : ERASE_OFF
    };
    
    /*! Determine if each Register needs to be forced set or not */
	readonly config ForceSetDefaultRegister_t forceSetDefaultRegister[] =
	[
		{ register : "FCTL1" , regForceSet : false }
	];
}
