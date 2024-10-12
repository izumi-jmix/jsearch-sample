package org.izumi.jmix.search.sample.view.search;


import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.StandardView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import org.izumi.jmix.search.sample.view.main.MainView;

@Route(value = "search-view", layout = MainView.class)
@ViewController("SearchView")
@ViewDescriptor("search-view.xml")
public class SearchView extends StandardView {
}