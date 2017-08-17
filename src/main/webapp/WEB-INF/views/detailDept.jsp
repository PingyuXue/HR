<%@include file="/WEB-INF/views/includes/header.jsp"%>
<%@include file="/WEB-INF/views/includes/navi.jsp"%>
<div class="content-wrapper">

    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Manage Department
            <small></small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Manage Department </a></li>
        </ol>
    </section>

    <!-- Main content -->
    <section class="content container-fluid">
        <div class="col-lg-12">
            <div class="panel panel-default">

                <div class="panel-body">
                    <table id="dept_detail" class="table table-bordered table-hover">

                        <thead>
                        <tr>
                            <th>&nbsp;</th>
                            <th>Dept. Name</th>
                            <th>Description</th>
                            <th>Contact Email</th>
                            <th>Contact number</th>
                            <th>Status</th>
                        </tr>
                        </thead>
                        <tbody>
                            <tr data-toggle="collapse" class="accordion-toggle">
                                <td>${dept.name}</td>
                                <td>${dept.name}</td>
                                <td>${dept.email}</td>
                                <td>${dept.email}</td>
                                <td>${dept.email}</td>
                            </tr>
                        </tbody>
                    </table>
                    <table id="emp_table" class="table table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>&nbsp;</th>
                            <th>firstName</th>
                            <th>lastName</th>
                            <th>contact</th>
                            <th>address</th>
                        </tr>
                        </thead>

                        <tbody>
                        <c:if test="${not empty empList}">
                            <c:forEach items="${empList}" var="emp">
                                <tr data-toggle="collapse" data-target="#emp_${emp.id}"
                                    class="accordion-toggle">
                                    <td><button class="btn btn-default btn-xs">
                                        <span class="glyphicon glyphicon-eye-open"></span>
                                    </button></td>
                                    <td>${emp.firstName}</td>
                                    <td>${emp.lastName}</td>
                                    <td>${emp.contact}</td>
                                    <td>${emp.address}</td>
                                </tr>
                                <tr>
                                    <td colspan="12" class="hiddenRow"><div
                                            class="accordian-body collapse" id="emp_${emp.id}">
                                        <button type="button" id="edit_button" class="btn btn-primary">Edit</button>
                                        <button type="button" id="assign_button" class="btn btn-primary">Change Department</button>
                                        <button type="button" id="delete_button" class="btn btn-primary">Delete Employee</button>

                                    </div></td>
                                </tr>
                            </c:forEach>
                        </c:if>
                        </tbody>
                    </table>
                </div>

            </div>

        </div>
    </section>
</div>
<%@include file="/WEB-INF/views/includes/footer.jsp"%>
<script>

</script>