<ul id="floatMenu" class="mainmenu" style="top: 0px; ">

    <li class="first"><a href="<%=request.getContextPath()%>/secure/action/dashboard">Dashboard</a></li>

    <!--
    
    <div onmouseover="document.getElementById('transaction').style.display = 'block';" onmouseout="document.getElementById('transaction').style.display = 'none';">
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("AGENT") || request.isUserInRole("SND")) {
    %> <li id="monthlyreport"><a class="nonlink">Transaction Report</a></li>
    <% }
    %>


<div id="transaction" style="display: none;">
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("AGENT") || request.isUserInRole("SND")) {
    %> <li class="red"><a href="<%=request.getContextPath()%>/secure/action/monthlyTransaction">- Summary</a></li>
    <% }
    %>

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("BSA") || request.isUserInRole("SND")) {
    %> <li class="red"><a href="<%=request.getContextPath()%>/secure/action/detailsInformation">- Detailed</a></li>

    <% }
    %>


</div>
</div>

<div onmouseover="document.getElementById('liftnrefund').style.display = 'block';" onmouseout="document.getElementById('liftnrefund').style.display = 'none';">


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    %> <li><a class="nonlink">Lift & Refund Report</a></li>
    <% }
    %>

<div id="liftnrefund" style="display: none;">
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    %> <li class="red"><a href="<%=request.getContextPath()%>/secure/action/monthlyLiftRefund">- Summary</a></li>
    <% }
    %>

</div>

</div>

    
    
    <div onmouseover="document.getElementById('kyc').style.display = 'block';" onmouseout="document.getElementById('kyc').style.display = 'none';">
    
    
    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    %> <li><a class="nonlink">KYC Status Report</a></li>
    <% }
    %>

<div id="kyc" style="display: none;">


    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    %>  <li class="red"><a href="<%=request.getContextPath()%>/secure/action/kycStatusSummary">- Summary</a></li>
    <% }
    %>

    <%    if (request.isUserInRole("DISTRIBUTOR") || request.isUserInRole("SND")) {
    %>  <li class="red"><a href="<%=request.getContextPath()%>/secure/action/kycStatus">- Detailed</a></li>
    <% }
    %>




</div>

</div>

    -->

    <%    if (request.isUserInRole("ADMINISTRATOR")) {
    %> <li><a href="<%=request.getContextPath()%>/secure/Admin/Account.jsp">Manage Accounts</a></li>
    <li><a href="<s:url action="secure/action/sm_tm_management" />"><p>User Mapping Management</p></a></li>
        <% }
        %>

</ul> 