<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>主页</title>
</head>
<body>
姓名: &nbsp &nbsp${name}
<br/>
性别：
<#if sex=="1">
    男
<#elseif sex=="2">
    女
<#else>
    其他
</#if>
<br/>
用户：
<#list userlist as user>
    ${user}
</#list>
</body>
</html>