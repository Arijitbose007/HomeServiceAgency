<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/x-icon" href="images/favicon.ico">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="navbarAndFooter.css" type="text/css">
</head>
<body>
	<jsp:include page="Navbar.jsp"></jsp:include>
	<section>
		<div class = "container py-5" style = "margin-top:7%;">
			<div class = "row border rounded-2 p-4">
				<div class = "col-md-10">
					<div class = "row">
						<div class = "col-md-3 d-flex align-items-center justify-content-center">
							<img src="./ImageViewer?id=${profInfo.id}&type=professionals" class="border border-4 border-success border-opacity-50 rounded-circle img-fluid" style="width: 6.25rem; height:6.25rem;">
						</div>
						<div class = "col-md-9">
							<h4 class="fw-semiblod">${profInfo.name} &#160<span class="fw-light fs-6 text-primary">(${profInfo.gender})</span></h4>
							<p class="text-secondary mb-1">Email: &#160 <em class="fw-light">${profInfo.email}</em></p>
							<p class="text-secondary mb-0">Rating: &#160 <span class="fw-light">${profInfo.rating}.0 &#9733;</span></p>
						</div>
					</div>
				</div>
				<div class = "col-md-2">
					<a href="#" class = "btn btn-dark">Book</a>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>