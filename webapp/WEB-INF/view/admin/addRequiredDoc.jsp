<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Required Doc</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
<!-- endinject -->

<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/style.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/jquery.toast.min.css">
<!-- endinject -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/adminResources/image/favicon.png" />
</head>

<body class="sidebar-light" onload="display()">
	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->

		<jsp:include page="header.jsp"></jsp:include>

		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->

			<jsp:include page="menu.jsp"></jsp:include>

			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row grid-margin">
						<div class="col-lg-12">
							<div class="card">
							<div class="card-header"
									style="background: linear-gradient(94deg, #5e2572, transparent);">
									<h4 class="text-white m-0">Add Required Document</h4>
								</div>
								<div class="card-body">
									
			
									<form action="saveRequiredDoc" method="POST" class="cmxform"
										novalidate="novalidate" onsubmit="return addRequiredDocValidation()">

										<input type="hidden" id="getContext" value="<%=request.getContextPath()%>" >

										<fieldset>

											<div class="form-group row">
												<label class="col-sm-3 col-form-label">Document
													Required For :</label>
												<div class="col-sm-4">
													<div class="form-check">
														<label class="form-check-label"> <input
															type="radio" class="form-check-input"
															name="documentRequiredFor" id="account" checked="checked"
															onclick="display()" value="Account"> Account<i
															class="input-helper"></i></label>
													</div>
												</div>
												
												<div class="col-sm-5">
													<div class="form-check">
														<label class="form-check-label"> <input
															type="radio" class="form-check-input"
															name="documentRequiredFor" id="loan" onclick="display()"
															value="Loan"> Loan <i class="input-helper"></i></label>
													</div>
												</div>
											</div>

											<div class="form-group" id="accountType" style="display: none;">
												<label for="exampleSelectGender">Account Type</label>
												 <select class="form-control" id="accountTypeSelect" name="accountType">
													<option value="" selected>Account Type</option>
													<c:forEach items="${accountTypeList}" var="i">
														<option value="${i.accountTypeId}">${i.accountType}</option>
													</c:forEach>
												</select>
											</div>

											<div class="form-group" id="loanType" style="display: none;">
												<label for="exampleSelectGender">Loan Type</label> 
												<select class="form-control" id="loanTypeSelect" name="loanType">
													<option value="" selected>Loan Type</option>
													<c:forEach items="${loanTypeList}" var="j">
														<option value="${j.loanTypeId}">${j.loanType}</option>
													</c:forEach>
												</select>
											</div>

											<div class="row">
												<div class="form-group col-10">
													<label for="exampleSelectGender">Required Document</label>
													<select class="form-control" id="requiredDoc">
													<option value="" selected>Required Document</option>
														<c:forEach items="${documentList}" var="k">
														<option value="${k.documentId}">${k.documentType}</option>
													</c:forEach>
													</select>
												</div>

												<button type="button" class="btn btn-info btn-sm mt-4 col-1"
													style="height: 40px" onclick="addRequiredDoc()">
													<i class="mdi mdi-plus"></i>
												</button>
											</div>

											<div class="table-responsive">
												<table class="table" id="docTable">
													<thead>
														<tr>
															<th>No.</th>
															<th>Required Document</th>
															<th>Action</th>
														</tr>
													</thead>
													<tbody id="requiredDocTable">
													</tbody>
												</table>
											</div>
											<br> <input class="btn btn-primary" type="submit"
												value="Add">

										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->

				<jsp:include page="footer.jsp"></jsp:include>

				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.validate.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/bootstrap-maxlength.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="<%=request.getContextPath()%>/adminResources/js/form-validation.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/bt-maxLength.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.toast.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/toaster.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/validation/addRequiredDoc.js"></script>
	<!-- End custom js for this page-->
	<script src="<%=request.getContextPath()%>/adminResources/js/custom/addRequiredDoc.js"></script>
</body>

</html>
