<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>Order ID:</h1>
				<h2>Hi Folks</h2>
				<xsl:value-of select="Order/@id"></xsl:value-of>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>
	<br></br>

	<xsl:template match="CustomerName">

		<xsl:value-of select="."></xsl:value-of>
	</xsl:template>
	<xsl:template match="Item">

		Item Name:
		<xsl:value-of select="ItemName"></xsl:value-of>
		Price:
		<xsl:value-of select="Price"></xsl:value-of>
	</xsl:template>
</xsl:stylesheet>