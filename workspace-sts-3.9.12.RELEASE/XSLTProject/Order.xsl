<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>Order Details:</h1>
				<h2>
					<xsl:value-of select="Order/CustomerName"></xsl:value-of>
				</h2>
				<h2>
				<xsl:value-of select="Order/@id"></xsl:value-of>
				</h2>
				<table border = "1">
				<tr>
				<th>Item ID</th>
				<th>Item Name</th>
				<th>Item Price</th>
				<th>Item Quantity</th>
				<th>Item Category</th>
				<xsl:for-each select="Order/Item">
				<tr>
				<td>
				<xsl:value-of select="ItemId"></xsl:value-of>
				</td>
				<td>
				<xsl:value-of select="ItemName"></xsl:value-of>
				</td>
				<td>
				<xsl:value-of select="Price"></xsl:value-of>
				</td>
				<td>
				<xsl:value-of select="Quantity"></xsl:value-of>
				</td>
				<td>
				<xsl:choose>
				<xsl:when test="Price>=900">
				<b>Platium</b>
				</xsl:when>
				<xsl:when test="Price>=800">
				<b>Gold</b>
				</xsl:when>
				<xsl:otherwise>
				<b>Silver</b>
				</xsl:otherwise>
				</xsl:choose>
				</td>
				</tr>
				
				</xsl:for-each>
				</tr>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>