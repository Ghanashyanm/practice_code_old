<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Loan</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/style.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/jquery.toast.min.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/adminResources/image/favicon.png" />
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
								<div class="card-header"
									style="background: linear-gradient(94deg, #5e2572, transparent);">
									<h4 class="text-white m-0">Add Loan</h4>
								</div>
								<div class="card-body">
								<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
								<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
									<f:form action="saveLoan" method="POST" modelAttribute="LoanVO" onsubmit="return addLoan()">
										<f:hidden path="loanId"/>
										<div class="form-group" id="loanTypeDiv">
											<label for="exampleSelectLoanType">Loan Type</label> 
											<f:select path="loanTypeVO.loanTypeId" 
												class="form-control" id="loanTypeSelect" name="loanType">
												<option value="" selected>Loan Type</option>
											<c:forEach items="${loanTypeList}" var="i"> 
												<f:option value="${i.loanTypeId}">${i.loanType}</f:option>
											</c:forEach>
											</f:select>
										</div>

										<div class="form-group" id="interestType">
											<label for="exampleSelectGender">Interest Type</label> <f:select
											path="interestType" class="form-control" id="interestTypeSelect" name="interestType">
												<option value="">Interest Type</option>
												<f:option value="Simple Interest">Simple Interest</f:option>
												<f:option value="Compound Interest">Compound Interest</f:option>
											</f:select>
										</div>

										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Interest Rate</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="25" path="interestRate"
													name="interestRate" id="interestRate" type="text"
													placeholder="Interest Rate" />
											</div>
											<label class="col-form-label">(in %)</label>
										</div>

										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Loan Amount</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="25" name="loanAmount" path="loanAmount"
													id="loanAmount" type="text" placeholder="Loan Amount" />
											</div>
										</div>

										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Tenure</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="25" name="tenure" path="tenure" 
													id="tenure" type="text" placeholder="Tenure" />
											</div>
											<label class="col-form-label">(in Year)</label>
										</div>

										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Description</label>
											</div>
											<div class="col-lg-8">
												<f:textarea id="description" class="form-control" path="description"
												maxlength="1000" rows="4"
												placeholder="Description"/>
											</div>
										</div>

										<input class="btn btn-primary" type="submit" value="Save">
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
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bootstrap-maxlength.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/form-validation.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bt-maxLength.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bt-maxLength.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.toast.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/toaster.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/validation/addLoan.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
