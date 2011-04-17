requires ti.catalog.msp430.peripherals.clock;
requires ti.catalog.msp430.peripherals.special_function;

package ti.catalog.msp430.peripherals.communication
{
    interface IUSCI , IUSCI_I2C , IUSCI_SPI , IUSCI_UART;
    interface IUSCI_A0_UART , IUSCI_A0_SPI , IUSCI_A1_UART;
    interface IUSCI_B0_SPI , IUSCI_B0_I2C;
    module USCI_A0_UART_2xx;
    module USCI_A0_SPI_2xx;
    module USCI_B0_SPI_2xx;
    module USCI_B0_I2C_2xx;
    module USCI_A1_UART_2xx;
}
