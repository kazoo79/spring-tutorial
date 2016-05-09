<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Book details</title>
    <spring:url value="/resources/core/css/hello.css" var="coreCss"/>
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <link href="${coreCss}" rel="stylesheet"/>
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Book list:</a>
        </div>
    </div>
</nav>

<div class="jumbotron"></div>

<div class="container">
    <div class="row">
        <div class="col-md-2">
            Title
        </div>
        <div class="col-md-2">
            Author
        </div>
        <div class="col-md-2">
            Description
        </div>
        <div class="col-md-2">
            Action
        </div>
    </div>
    <c:forEach var="book" items="${bookList}">
        <div class="row">
            <div class="col-md-2">
                    ${book.title}
            </div>
            <div class="col-md-2">
                    ${book.author}
            </div>
            <div class="col-md-2">
                    ${book.description}
            </div>
            <div class="col-md-2">
                <a class="btn btn-default" href="edit?id=${book.id}">Edit</a>
            </div>
        </div>
    </c:forEach>
</div>


</html>
