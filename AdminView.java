package com.example.fullstackdeveloperchallenge.ui;

import com.example.fullstackdeveloperchallenge.backend.Company;
import com.example.fullstackdeveloperchallenge.backend.CompanyService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("admin")
@AnonymousAllowed
public class AdminView extends VerticalLayout {

    public AdminView(CompanyService service){
        var crud = new GridCrud<>(Company.class, service);
        crud.getGrid().setColumns("nameCompany","address","category","amountEmployees");
        crud.getCrudFormFactory().setVisibleProperties("nameCompany","address","category","");
        crud.setAddOperationVisible(true);
        Button addEvent = new Button("Home View");

        addEvent.addClickListener(clickEvent -> {
            addEvent.getUI().ifPresent(ui -> ui.navigate(""));
        });
        crud.getCrudLayout().addToolbarComponent(addEvent);

        add(
                new H1("Admin View"),
                crud
        );
    }

}
