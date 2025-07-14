
## Goal: Improve the security layer of my Skill Swap project using Spring Security.
### 🛡️ Learning Spring Security – Day 1 (08/07/2025)
#### Topics Covered:
✅ What is Spring Security?

✅ Why do we need it in real-world applications?

✅ Understanding CSRF and CSRF Tokens

✅ Session ID and how sessions maintain login state

✅ SecurityContext and SecurityContextHolder

✅ In-Memory Authentication setup

#### Reflection:
Today was eye-opening! I didn’t just learn technical terms — I learned how real-world backend attacks happen and how Spring Security acts as a shield.
Every concept makes me feel more confident about building secure applications.

### 🛡️ Learning Spring Security – Day 2 (09/07/2025)
#### Topics Covered:
✅ How Spring Security uses UserDetails and UserDetailsService to represent and load user data

✅ Implementing In-Memory Authentication using InMemoryUserDetailsManager

✅ Defining custom users with roles like ADMIN

✅ Creating a custom SecurityFilterChain

✅ Disabling CSRF token for development/testing

✅ What is PasswordEncoder and why we need to encode passwords

✅ Common mistake debugging (e.g., login issues, invalid credentials, role mapping)

#### Reflection:
Today felt like leveling up! I learned how Spring Security knows "who I am" and "what I can access" through UserDetails.
I also built my first custom security filter chain, learned how password encoding works, and started experimenting with login/logout behavior.

One of the biggest takeaways was:

Even though CSRF protection is important, we can disable it while testing to focus on building and understanding authentication first.

### 🛡️ Learning Spring Security – Day 3 (10/07/2025)
#### Topics Covered:

✅ Understand the diffrence between form login and http basic

✅ Implementing role based authorization

✅ Login and logout flows using Spring Boot's default form

✅ Creating custom logout behaviour

#### Reflection:
Today i learned the flow of how the request is send and comeback as response and each stage it passes through. Compare it with real world request mapping to understand it deeply.
I also learnt how the custom logout pages are build and what are the process that is happening behind once we logged out.

### 🛡️ Learning Spring Security – Day 3 (11/07/2025)
#### Topics Covered:

- ✅ Replace In-Memory with Database authentication
- ✅ What is `UserDetails` and how to create a custom implementation
- ✅ What is `UserDetailsService` and how to fetch users from DB
- ✅ Using `AuthenticationProvider` and `DaoAuthenticationProvider`
- ✅ Connecting Spring Security with MySQL via Spring Data JPA
#### Reflection 
Today i learnt how to fetch the data from database using UserDetailsService by implementing our own UserDetailsServicee interface to let the spring use  our customized UserDetailsService rather than the default one and learnt the concept of AuthenticationProvider
Tested custom login via postman to deeply understand how the authentication provider works.





