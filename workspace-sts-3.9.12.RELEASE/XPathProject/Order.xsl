<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>Order Details:</h1>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>
	<xsl:template match = "CustomerName">
		Customer Name:
		<b>
		<xsl:value-of select="."></xsl:value-of>
		</b>
	</xsl:template>
	<xsl:template match = "Item">
		
		<br />Order ID:
		<xsl:value-of select="../@id"></xsl:value-of>
		
		<br />Item Name:
		<xsl:value-of select="./ItemName"></xsl:value-of>
		
		<br />Item Price:
		<xsl:value-of select="round(./Price)"></xsl:value-of>
	</xsl:template>	
</xsl:stylesheet>
			