<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Loan Type</title>
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

<body class="sidebar-light">
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
						<div class="col-12">
							<div class="card">
								<div class="card-header" style="background: linear-gradient(94deg, #5e2572, transparent);">
										<h4 class="text-white m-0">Add Loan Type</h4>
								</div>
								<div class="card-body">
									
									<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
									<f:form action="insertLoanType" modelAttribute="LoanTypeVO" method="post" onsubmit="return addLoanType()">
									<f:hidden path="loanTypeId"/>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Loan Type</label>
										</div>
										<div class="col-lg-8">
											<f:input class="form-control" maxlength="25" path="loanType"
												name="loanType" id="loanType" type="text"
												placeholder="Loan Type"/>
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Loan Description</label>
										</div>
										<div class="col-lg-8">
											<f:textarea id="loanDescription" class="form-control" path="loanDescription"
												maxlength="1000" rows="4" name="loanTypeDescription"
												placeholder="Loan Description"/>
										</div>	
									</div>
									<input class="btn btn-primary" type="submit" value="Add">
									</f:form>
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
	<script src="<%=request.getContextPath()%>/adminResources/js/validation/addLoanType.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
