<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <title>Book create/update</title>
    <spring:url value="/resources/core/css/hello.css" var="coreCss"/>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>


    <meta http-equiv="cache-control" content="no-store" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="Pragma" content="no-cache" />

</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Book create / update</a>
        </div>
    </div>
</nav>

<div class="jumbotron"></div>

<form:form method="post" modelAttribute="book-form" action="saveUpdate" cssClass="container">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <form:label path="title">Title: </form:label>
            </div>
            <div class="col-md-4">
                <form:input path="title"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <form:label path="author">Author: </form:label>
            </div>
            <div class="col-md-4">
                <form:input path="author"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4">
                <form:label path="description">Description</form:label>
            </div>
            <div class="col-md-4">
                <form:input path="description"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <input type="submit" value="Submit"/>
            </div>
        </div>
    </div>
    <form:hidden path="id"/>
</form:form>

<hr>
<footer>
    <p>© pd 2016</p>
</footer>
</div>

<spring:url value="/resources/core/js/main.js" var="mainJs"/>
<spring:url value="/resources/core/js/bootstrap.min.js" var="bootstrapJs"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${mainJs}"></script>
<script src="${bootstrapJs}"></script>

</body>
</html>