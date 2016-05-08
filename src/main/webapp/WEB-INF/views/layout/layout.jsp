<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EasyUI Demo</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/static/easyui/themes/icon.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/static/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/easyui/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
    <div data-options="region:'north',href:'${pageContext.request.contextPath }/layout/north'" style="height:100px;"></div>
    <div data-options="region:'south',href:'${pageContext.request.contextPath }/layout/south'" style="height:60px;"></div>
    <div data-options="region:'east',title:'在线用户',href:'${pageContext.request.contextPath }/layout/east'" style="width:100px;"></div>
    <div data-options="region:'west',title:'菜单栏',href:'${pageContext.request.contextPath }/layout/west'" style="width:180px;"></div>
    <div data-options="region:'center',title:'工作区'" style="padding:5px;background:#eee;"></div>
</body>
</html>