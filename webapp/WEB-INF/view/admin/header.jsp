<nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
	<div
		class="navbar-menu-wrapper d-flex align-items-stretch justify-content-between">
		<ul class="navbar-nav mr-lg-2 d-none d-lg-flex">
			<li class="nav-item nav-toggler-item">
				<button class="navbar-toggler align-self-center" type="button"
					data-toggle="minimize">
					<span class="mdi mdi-menu"></span>
				</button>
			</li>
			<!-- custom : Search deleted from here -->
		</ul>
		<div
			class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
			<a class="navbar-brand brand-logo" href="index"><img
				src="<%=request.getContextPath()%>/adminResources/image/logo-mini.svg"
				height="100px" width="100px" alt="logo" />Banking System with Alexa</a>
		</div>
		<ul class="navbar-nav navbar-nav-right">


			<li class="nav-item nav-profile dropdown"><a
				class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"
				id="profileDropdown"> <img
					src="<%=request.getContextPath()%>/adminResources/image/GhanashyamProfilePhoto.jpeg"
					alt="profile" /> <span class="nav-profile-name">Ghanashyam
						Sangani</span>
			</a>
				<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
					aria-labelledby="profileDropdown">

					<!-- custom: setting deleted from here -->

					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="/logout"> <i
						class="mdi mdi-logout text-primary"></i> Logout
					</a>
				</div></li>

			<!-- custom : Right menu delete from here -->
		</ul>
	</div>
</nav>
