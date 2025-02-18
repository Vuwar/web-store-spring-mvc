<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron" >
        <a href="<c:url value="/j_spring_security_logout"/>" class="btn btn-danger btn-mini pull-right">logout</a>
        <div class="container">
            <h1>Products</h1>
            <p>Add products</p>
        </div>
    </div>
</section>
<section class="container">
    <%--@elvariable id="newProduct" type="newProduct"--%>
        <form:form modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data" method="POST">
        <fieldset>
            <legend>Add new product</legend>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2"
                       for="productId"> <spring:message code= "addProduct.form.productId.label"/> </label>
                <div class="col-lg-10">
                    <form:input id="productId" path="productId" type="text" cssClass="input-large"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="description">Description</label>
                <div class="col-lg-10">
                    <form:textarea id="description" path="description" rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="condition">Condition</label>
                <div class="col-lg-10">
                    <form:radiobutton id="condition" path="condition" value="New" />New
                    <form:radiobutton id="condition" path="condition" value="Old" />Old
                    <form:radiobutton id="condition" path="condition" value="Refurbished"/>Refurbished
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="productImage">
                    <spring:message code="addProduct.form.productImage.label"/></label>
                <div class="col-lg-10">
                    <form:input id="productImage" path="productImage" type="file" class="form:input-large" />
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="userManualPdf">
                    <spring:message code="addProduct.form.userManualPdf.label"/></label>
                <div class="col-lg-10">
                    <form:input id="userManualPdf" path="userManualPdf" type="file" class="form:input-large" />
                </div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/>
                </div>
            </div>
        </fieldset>
    </form:form>
</section>
</body>
</html>
