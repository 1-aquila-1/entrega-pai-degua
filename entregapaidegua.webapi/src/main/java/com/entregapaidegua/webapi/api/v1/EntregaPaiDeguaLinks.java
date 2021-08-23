// package com.entregapaidegua.webapi.api.v1;

// import com.entregapaidegua.webapi.api.v1.controller.EmpresaController;

// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

// import org.springframework.hateoas.IanaLinkRelations;
// import org.springframework.hateoas.Link;
// import org.springframework.stereotype.Component;

// @Component
// public class EntregaPaiDeguaLinks {
//     public Link linkToEmpresa(Long id) throws Exception {
// 		return linkToEmpresa(id, IanaLinkRelations.SELF.value());
// 	}

//     public Link linkToEmpresa(Long id, String rel) throws Exception {
// 		return linkTo(methodOn(EmpresaController.class).buscar(id)).withRel(rel);
// 	}

// }

