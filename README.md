====================================
Contact and feedback:

- https://www.youtube.com/channel/UCVyvT1t3p-ciOeInzaSbIcQ

- https://github.com/TechPrudent/

- techprudent91@gmail.com

- https://trello.com/b/8QKy3byG/techprudent

- https://techprudent91.blogspot.com/

- https://www.facebook.com/techprudents/

- https://twitter.com/techprudent

- https://www.linkedin.com/in/tech-prudent-37831216b/

- https://plus.google.com/u/0/114035390968854033062

====================================

# spring-boot-cache
spring boot starter cache implementation on a spring boot application with jpa, mysql, rest service

spring boot caching
===================

https://github.com/TechPrudent/spring-boot-cache

- improve performance
- avoid overhead on server

- providers: ehcache, couchbase, redis, caffeine

- add caching abstraction - spring boot starter cache dependency
- implement caching - providers - caffiene, ehcache...

- @EnableCaching - to autoconfigure
- @Cacheable
- @cacheput
- @cacheEvict

- application of cacheEvict with cacheable

- demo on cacheable
- demo on cacheput
- demo on cacheevict

- enable cache with cache names

	dependency: spring-boot-starter-cache
		
	@EnableCaching
		
 	@Cacheable(value = "customer-id")
	
	@CacheEvict(allEntries=true, cacheNames="customer-id")
	
	@CachePut(value = "customer-name")

	 cache:
		cache-names:
		- customer-id
		- customer-name
	
	GET: http://localhost:8080/customer/name/customer1
	GET: http://localhost:8080/customer/id/23
	PUT: http://localhost:8080/customer/update
	
	{
    "id": 43,
    "name": "customer1",
    "gender": "male",
    "contact": "456"
	}
