// package com.entregapaidegua.webapi.api.v1.assembler;

// import com.entregapaidegua.entity.Empresa;
// import com.entregapaidegua.webapi.api.v1.EntregaPaiDeguaLinks;
// import com.entregapaidegua.webapi.api.v1.controller.EmpresaController;
// import com.entregapaidegua.webapi.api.v1.model.EmpresaRequestModel;
// import com.entregapaidegua.webapi.api.v1.model.EmpresaResponseModel;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
// import org.springframework.stereotype.Component;

// @Component
// public class EmpresaRequestModelAssembler extends  RepresentationModelAssemblerSupport<Empresa, EmpresaResponseModel> {
	
// 	@Autowired
// 	private EntregaPaiDeguaLinks entregaLinks;
	
// 	// @Autowired
// 	// private AlgaSecurity algaSecurity;

//     public EmpresaRequestModelAssembler() {
//         super(EmpresaController.class, EmpresaResponseModel.class);
//     }

//     @Override
//     public EmpresaResponseModel toModel(Empresa entity) {
//         EmpresaResponseModel requestModel = createModelWithId(entity.getId(), entity);
		
// 		try {
// 			requestModel.add(entregaLinks.linkToEmpresa(requestModel.getId()));
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}
		
// 		return requestModel;
//     }
    
// }
