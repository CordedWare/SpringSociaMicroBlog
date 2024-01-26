<#import "parts/common.ftlh" as c>
<#import "parts/login.ftlh" as l>

<#--<@c.page>-->
<#--    Add new user-->
<#--    <#if message??>${message}<#else>Default message</#if>-->
<#--    <@l.login "/registration" true/>-->
<#--</@c.page>-->

<@c.page>
    <div class="mb-1">Добавить нового пользователя</div>
    ${message?ifExists}
    <@l.login "/registration" true />
</@c.page>


<#--    <#if message??>${message}</#if>-->
<#--${message}-->
<#--${message?ifExists}-->
