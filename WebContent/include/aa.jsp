<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<link rel="stylesheet" type="text/css" href="/liuxing/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/liuxing/css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="/liuxing/css/style.css" />
    <script type="text/javascript" src="/liuxing/js/jquery2.js"></script>
    <script type="text/javascript" src="/liuxing/js/jquery2.sorted.js"></script>
    <script type="text/javascript" src="/liuxing/js/bootstrap.js"></script>
    <script type="text/javascript" src="/liuxing/js/ckform.js"></script>
    <script type="text/javascript" src="/liuxing/js/common.js"></script>
    <script type="text/javascript" src="/liuxing/js/jquerypicture.js"></script>
    <script type="text/javascript" src="/liuxing/js/jquery-1.7.2.js"></script>
    <link rel="stylesheet" type="text/css" href="/liuxing/css/formui.css"/>
    <script type="text/javascript" src="/liuxing/js/tb.js"></script>
    <script type="text/javascript">
        $(function () {
            $(".datepicker").datepicker();

            $('#list').hide();
            $('#find').click(function () {
                $('#list').show();
            })
        })

    </script>
    <style type="text/css">
        body {font-size: 20px;                                                                                                                                                   
            padding-bottom: 40px;
            background-color:#e9e7ef;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>