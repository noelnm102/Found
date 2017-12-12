<%@include file="header.html"%>
<html>
<head>
<title>View by Group Success</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

<center>
<h2>View by Group Success</h2>
</center>
<!--Body: view by group information-->
<center>
<jsp:useBean id="group" class="assign.dbaccess.Group"
			scope="request">
		</jsp:useBean>
<!--<form method="post">
	 <table  cellpadding="0" cellspacing="0" width="50%"">
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">E-mail</td>
			<td><input type="text" name="emailid" maxlength="50" value="" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<br>
			<table  width="50%">
				<tr>
					<td><input type="submit" name="save" value="View by Group"/></td>
					<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>
	</table> 
	
	
</form>-->

		<table border="1" cellpadding="1" cellspacing="0" width="50%"">
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Group id</td>
				<td><jsp:getProperty name="group" property="groupID" /></td>
			</tr>
			<tr>
				<td bgcolor="#FAFAF9" style="padding-left: 10px;">Group Name</td>
				<td><jsp:getProperty name="group" property="gName" /></td>
			</tr>

			
		</table>
</center>
</body>

	

</html>
<%@include file="footer.html"%>

</body>
