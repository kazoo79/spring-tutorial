<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Book details</title>
    <spring:url value="/resources/core/css/hello.css" var="coreCss" />
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${coreCss}" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Book details:</a>
        </div>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-md-4">
            Id:
        </div>
        <div class="col-md-4">
            ${bookForm.id}
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            Title:
        </div>
        <div class="col-md-4">
            ${bookForm.title}
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            Author:
        </div>
        <div class="col-md-4">
            ${bookForm.author}
        </div>
    </div>

    <div class="row">
        <div class="col-md-4">
            Description:
        </div>
        <div class="col-md-4">
            ${bookForm.description}
        </div>
    </div>
</div>
