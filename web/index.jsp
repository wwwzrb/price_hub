<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/index_v5.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:51 GMT -->
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>index</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">

</head>
<s:set name="user" value="#session['user']"/>
<body class="gray-bg top-navigation">

    <div id="wrapper">
        <div id="page-wrapper" class="gray-bg">
            <div class="row border-bottom white-bg">
                <nav class="navbar navbar-static-top" role="navigation">
                    <div class="navbar-header">
                        <button aria-controls="navbar" aria-expanded="false" data-target="#navbar" data-toggle="collapse" class="navbar-toggle collapsed" type="button">
                            <i class="fa fa-reorder"></i>
                        </button>
                        <a href="#" class="navbar-brand">比价导航</a>
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> 电脑,配件 <span class="caret"></span></a>
                                <ul role="menu" class="dropdown-menu">
                                    <li><a href="general.action?pageNow=1&classification=笔记本电脑">笔记本电脑</a>
                                    </li>
                                    <li><a href="#">移动硬盘</a>
                                    </li>
                                    <li><a href="#">显卡</a>
                                    </li>
                                    <li><a href="#">U盘</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> 手机数码 <span class="caret"></span></a>
                                <ul role="menu" class="dropdown-menu">
                                    <li><a href="general.action?pageNow=1&classification=手机">手机</a>
                                    </li>
                                    <li><a href="#">充电宝</a>
                                    </li>
                                    <li><a href="#">配件</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a aria-expanded="false" role="button" href="#" class="dropdown-toggle" data-toggle="dropdown"> 摄影摄像 <span class="caret"></span></a>
                                <ul role="menu" class="dropdown-menu">
                                    <li><a href="#">菜单列表</a>
                                    </li>
                                    <li><a href="#">菜单列表</a>
                                    </li>
                                    <li><a href="#">菜单列表</a>
                                    </li>
                                    <li><a href="#">菜单列表</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    <div class="navbar-collapse collapse" id="navbar">
                        <ul class="nav navbar-top-links navbar-right">
                            <%
                                if (session.getAttribute("user") == null)
                                {
                            %>
                                <li>
                                     <a href="sign.jsp">
                                        <i class="fa fa-sign-in"></i> 登陆
                                     </a>
                                </li>
                            <%
                            }
                            else
                            {
                            %>

                            <li>
                                <a href="sign.jsp">
                                    <i class="fa fa-sign-out"></i> 退出
                                </a>
                            </li>
                            <%
                                }
                            %>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="wrapper wrapper-content">
                <div class="container">
                    <div class="ui cards">
                    <div class="ui card">
                        <div class="image">
                            <img src="img/profile_big.jpg">
                        </div>
                        <div class="content">
                            <h2 class="ui red header">
                                <i class="yen icon"></i>
                                price
                            </h2>
                        </div>
                        <div class="extra content">
                            <div class="description">
                                海伦是一个工作生活在纽约，他喜欢烹饪，美术，园艺。
                            </div>
                        </div>
                        <div class="ui bottom attached button">
                            查看详细
                        </div>

                    </div>
                    </div>

                </div>

            </div>
        </div>
    </div>

    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/flot/jquery.flot.js"></script>
    <script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="js/plugins/chartJs/Chart.min.js"></script>
    <script src="js/plugins/peity/jquery.peity.min.js"></script>
    <script src="js/demo/peity-demo.min.js"></script>
    <script src="semantic-ui/semantic/dist/semantic.min.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/index_v5.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:52 GMT -->
</html>
