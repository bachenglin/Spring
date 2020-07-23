<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<h1>Order Details</h1>
				<h3>
					<xsl:value-of select="Order/CustomerName"></xsl:value-of>
				</h3>
				<h3>
					<xsl:value-of select="Order/@id"></xsl:value-of>
				</h3>
				<table border="1">
					<tr>
						<th>Item ID</th>
						<th>Item Name</th>
						<th>Item Price</th>
						<th>Item Quantity</th>
						<xsl:for-each select="Order/Item">
							<xsl:sort select="Price" data-type="number"
								order="descending"></xsl:sort>
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
							</tr>
						</xsl:for-each>
					</tr>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>