#!/bin/bash

CURRENT_DIR=`pwd`

export DSPLINK=${CURRENT_DIR}/dsplink/dsplink_linux_1_65_00_03/dsplink
export XDC_INSTALL_DIR=${CURRENT_DIR}/xdctools/xdctools_3_20_06_81
export CODEGEN_INSTALL_DIR=${CURRENT_DIR}/cgt
export BIOS_INSTALL_DIR=${CURRENT_DIR}/dspbios/bios_5_41_07_24

cd ${DSPLINK}

perl config/bin/dsplinkcfg.pl --platform=OMAP3530 --nodsp=1 --dspcfg_0=OMAP3530SHMEM --dspos_0=DSPBIOS5XX --gppos=OMAPLSP --comps=ponslrmc

XDCPATH=${DSPLINK} ${XDC_INSTALL_DIR}/xdc .make -PR .
XDCPATH=${DSPLINK} ${XDC_INSTALL_DIR}/xdc clean -PR .
XDCPATH=${DSPLINK} ${XDC_INSTALL_DIR}/xdc .interfaces -PR .

cd ${DSPLINK}/dsp/src && make BASE_CGTOOLS="${CODEGEN_INSTALL_DIR}" BASE_SABIOS="${BIOS_INSTALL_DIR}" all

cd ${DSPLINK}/dsp/src/samples && make BASE_CGTOOLS="${CODEGEN_INSTALL_DIR}" BASE_SABIOS="${BIOS_INSTALL_DIR}" all
