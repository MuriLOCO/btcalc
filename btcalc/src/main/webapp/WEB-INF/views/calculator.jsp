<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix='c'    uri='http://java.sun.com/jsp/jstl/core'       %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<h2>BTCalc</h2>
		<form:form method="post" action="calculate.html" commandName="calculatorForm">
				<table>
			<tr>
					<td>
						Hash Rate (GH/s):
					</td>
					<td>
						<form:input type="number" step="any" min="0" path="hashRate" required="required" />
					</td>
					<td>						
						Power (Watts):
					</td>
					<td>						
						<form:input type="number" step="any" min="0"  path="powerConsumption" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						Power Cost ($/kWh):
					</td>
					<td>
						<form:input type="number" step="any" min="0"  path="powerCost" required="required" />
					</td>
					<td>						
						Pool Fees %:
					</td>
					<td>						
						<form:input type="number" step="any" min="0"  path="poolFees" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						Bitcoin Difficulty:
					</td>
					<td>
						<form:input type="number" step="any" min="0"  path="btcDifficulty" required="required" />
					</td>
					<td>						
						Block Reward:
					</td>
					<td>						
						<form:input type="number" step="any" min="0"  path="blockReward" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						Bitcoin to Dollar (USD):
					</td>
					<td>
						<form:input type="number" step="any" min="0"  path="btcUsDollar" required="required" />
					</td>
					<td>						
						Hardware Costs (USD):
					</td>
					<td>						
						<form:input type="number" step="any" min="0"  path="hardwareCost" required="required" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Calculate">
					</td>
				</tr>
				<c:if test="${not empty hashTime}">
					<tr>
						<td>
							Hash Time:
						</td>
						<td>
							<b>${hashTime}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty energyCostPerYear}">
					<tr>
						<td>
							Energy Cost per Year:
						</td>
						<td>
							<b>${energyCostPerYear}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty blocksPerYear}">
					<tr>
						<td>
							Blocks per Year:
						</td>
						<td>
							<b>${blocksPerYear}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty coinsPerYear}">
					<tr>
						<td>
							Coins per Year:
						</td>
						<td>
							<b>${coinsPerYear}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty revenuePerYear}">
					<tr>
						<td>
							Revenue per Year:
						</td>
						<td>
							<b>${revenuePerYear}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty profitPerYear}">
					<tr>
						<td>
							Profit per Year:
						</td>
						<td>
							<b>${profitPerYear}</b>
						</td>
					</tr>
				</c:if>
				<c:if test="${not empty netProfit}">
					<tr>
						<td>
							Net Profit:
						</td>
						<td>
							<b>${netProfit}</b>
						</td>
					</tr>
				</c:if>
			</table>
		</form:form>
	</body>
</html>
