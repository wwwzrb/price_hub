<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/index_v5.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:18:51 GMT -->
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>Detail</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link rel="stylesheet" href="semantic-ui/semantic/dist/semantic.min.css">

</head>
<s:set name="user" value="#session['user']"/>
<s:set name="detail" value="#session['detail']"/>

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
                <div class="row">
                    <div class="col-lg-8">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5><s:property value="#detail.productName"/></h5>
                            </div>
                            <div class="ibox-content">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <img src="<s:property value="#detail.productCover"/>">
                                        </div>
                                    <div class="col-lg-4">
                                        <table class="ui table">
                                            <tbody>
                                            <s:iterator value="#detail.list" id="param">
                                            <tr>

                                                <td><s:property value="#param"/></td>

                                            </tr>
                                            </s:iterator>
                                            </tbody>

                                        </table>
                                        </div>
                                </div>
                            </div>
                            </div>
                    </div>


                    <div class="col-lg-4">
                        <div class="ibox float-e-margins">
                            <div class="ui comments">
                                <div class="ui divider"></div>
                                <s:iterator value="#detail.remarks" id="remarks">
                                    <div class="comment">
                                        <div class="content">
                                            <a class="author"><s:property value="#remarks.userName"/></a>
                                            <div class="metadata">
                                                <span class="date"><s:property value="#remarks.remarkTime"/></span>
                                            </div>
                                            <div class="text"><s:property value="#remarks.remark"/></div>
                                        </div>
                                    </div>
                                </s:iterator>
                                <form class="ui form" method="post" action="remark.action">
                                    <div class="field">
                                        <input type="hidden" name="userId" value="<s:property value="#user.userId"/>"/>
                                        <input type="hidden" name="id" value="<s:property value="#detail.id"/>"/>
                                        <textarea name="remark" rows="1"></textarea>
                                    </div>
                                    <%
                                        if (session.getAttribute("user") == null)
                                        {
                                    %>
                                        <h4 class="ui">请<a href="sign.jsp">登陆</a>后评论 ....</h4>
                                    <%
                                    }
                                    else
                                    {
                                    %>
                                    <button class="ui blue labeled submit icon button"><i class="icon edit"></i> 评论 </button>
                                    <%
                                        }
                                    %>
                                </form>
                            </div>
                        </div>
                    </div>
                    </div>

                <div class="row">
                    <div class="col-lg-8">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>详细价格及参数比较</h5>
                            </div>
                            <div class="ibox-content">
                                <table class="ui padded table">
                                    <thead>
                                    <tr>
                                        <th>商家 </th>
                                        <th>商品名</th>
                                        <th>价格</th>
                                    </tr>
                                    </thead>
                                        <tr>
                                            <td>京东商城</td>
                                            <td><a href="<s:property value="#detail.linkJd"/>"><s:property value="#detail.nameJd"/></a></td>
                                            <td><h2 class="ui red header"><s:property value="#detail.priceJd"/></h2></td>
                                        </tr>
                                        <tr>
                                        <td>亚马逊中国</td>
                                        <td><a href="<s:property value="#detail.linkAamzon"/>"><s:property value="#detail.nameAmazon"/></a></td>
                                        <td><h2 class="ui red header"><s:property value="#detail.priceAmazon"/></h2></td>
                                        </tr>
                                        <tr>
                                            <td>一号店</td>
                                            <td><a href="<s:property value="#detail.linkOne"/>"><s:property value="#detail.nameOne"/></a></td>
                                            <td><h2 class="ui red header"><s:property value="#detail.priceOne"/></h2></td>
                                        </tr>


                                    </tbody>
                                </table>
                            </div>
                        </div>
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
