package org.izumi.jmix.search.sample.view.customer;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.izumi.jmix.search.sample.entity.Customer;
import org.izumi.jmix.search.sample.view.main.MainView;


@Route(value = "customers", layout = MainView.class)
@ViewController("Customer.list")
@ViewDescriptor("customer-list-view.xml")
@LookupComponent("customersDataGrid")
@DialogMode(width = "64em")
public class CustomerListView extends StandardListView<Customer> {
}