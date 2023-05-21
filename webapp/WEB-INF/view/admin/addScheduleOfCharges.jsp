<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Schedule Of Charges</title>
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
								<div class="card-header"
									style="background: linear-gradient(94deg, #5e2572, transparent);">
									<h4 class="text-white m-0">Add Schedule Of Charges</h4>
								</div>
								<div class="card-body">
									
									<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
									<f:form action="insertScheduleOfCharges" method="POST" modelAttribute="ScheduleOfChargesVO" onsubmit="return adddScheduleOfCharges()">
									<f:hidden path="scheduleOfChargesId"/>
									<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
									<div class="form-group">
												<label for="exampleSelectGender">Account Type</label> 
												<f:select path="accountTypeVO.accountTypeId" class="form-control" id="accountTypeSelect" >
												<option value="" selected>Account Type</option>
													<c:forEach items="${accountTypeList}" var="i">
													<f:option value="${i.accountTypeId}">${i.accountType}</f:option>
													</c:forEach>
												</f:select>
											</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Interest Rate</label>
										</div>
										<div class="col-lg-8">
											<f:input class="form-control" maxlength="25" path="interestRate"
												name="interestRate" id="interestRate" type="text"
												placeholder="Interest Rate"/>
										</div>
									</div>
									
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Amount Range</label>
										</div>
										<div class="col-lg-8">
											<f:input class="form-control" maxlength="25" path="amountRange"
												name="amountRange" id="amountRange" type="text"
												placeholder="Amount Range"/>
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Debit Card Charge</label>
										</div>
										<div class="col-lg-8">
											<f:input class="form-control" maxlength="25" path="debitCardCharge"
												name="debitCardCharge" id="debitCardCharge" type="text"
												placeholder="Debit Card Charge"/>
										</div>/Year
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">SMS charge</label>
										</div>
										<div class="col-lg-8">
											<f:input class="form-control" maxlength="25" path="smsCharge"
												name="smsCharge" id="smsCharge" type="text"
												placeholder="SMS charges"/>
										</div>/Year
									</div>

									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Same Bank</label>
										</div>
										<div class="col">
											<label>Free Transactions</label>
											<div id="the-basics">
												<f:input class="typeahead" type="text" path="sameBankFreeTransaction"
													id="sameBankFreeTransaction"  placeholder="Same Bank Free Transaction"/>
											</div>
										</div>
										<div class="col">
											<label>Service Charge/Transactions</label>
											<div id="bloodhound">
												<f:input class="typeahead" type="text" path="sameBankServiceTransaction" id="sameBankServiceTransaction"
													placeholder="Same Bank Service Charge/Transactions"/>
											</div>
										</div>
										
									</div>
									
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Other Bank</label>
										</div>
										<div class="col">
											<div id="the-basics">
												<f:input class="typeahead" type="text" path="otherBankFreeTransaction"  id="otherBankFreeTransaction"
													placeholder="Other Bank Free Transaction"/>
											</div>
										</div>
										<div class="col">
											<div id="bloodhound">
												<f:input class="typeahead" type="text" path="otherBankServiceTransaction" id="otherBankServiceTransaction"
													placeholder="Other Bank Service Charge/Transactions"/>
											</div>
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
	<script src="<%=request.getContextPath()%>/adminResources/js/validation/addScheduleOfCharges.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
