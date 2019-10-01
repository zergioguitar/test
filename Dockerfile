FROM websphere-liberty:webProfile7
ADD jvm.options /config/
ADD target/*.jar /config/dropins/