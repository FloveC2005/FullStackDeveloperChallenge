package com.example.fullstackdeveloperchallenge.ui;

import com.example.fullstackdeveloperchallenge.backend.Company;
import com.example.fullstackdeveloperchallenge.backend.Employee;
import com.example.fullstackdeveloperchallenge.backend.EmployeeService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.vaadin.crudui.crud.impl.GridCrud;


@Route("")
@AnonymousAllowed
public class HomeView extends VerticalLayout {

    public HomeView(EmployeeService service){
        var crud = new GridCrud<>(Employee.class, service);
        crud.getGrid().setColumns("nameEmployee","nameCompany");
        crud.getCrudFormFactory().setVisibleProperties("nameEmployee","nameCompany");
        crud.setAddOperationVisible(true);
        Button addEvent = new Button("Company View");

        addEvent.addClickListener(clickEvent -> {
            addEvent.getUI().ifPresent(ui -> ui.navigate("admin"));
        });
        crud.getCrudLayout().addToolbarComponent(addEvent);
        add(
                new H1("Home View"),
                crud
        );
    }

}
