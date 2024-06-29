package command;

import command.framework.Command;

public class AddCustomerCommand implements Command{
    private CustomerService customer;

    public AddCustomerCommand(CustomerService customer) {
        this.customer = customer;
    }

    @Override
    public void execute() {
        customer.addCustomer();
    }
}
