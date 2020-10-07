

<head>


    <link href="<%=request.getContextPath()%>/css/demo_table.css" rel="stylesheet" type="text/css" media="screen" />
    <script src="<%=request.getContextPath()%>/js/jquery.dataTables.js" type="text/javascript"></script>

    <script>
        $(document).ready(function() {
            $('#example').dataTable();
        });
    </script>
