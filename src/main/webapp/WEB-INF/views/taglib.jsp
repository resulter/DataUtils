<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<c:set var="studyService" value="${pageContext.request.contextPath}/studyservice"/>
<c:set var="httpContextPath" value="http://${header['host']}${pageContext.request.contextPath}"/>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
