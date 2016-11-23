Demo of the awesome power of macros in a Clojurescript. 

Boring ways to serve static content: 

1.  Use a static site generator to make HTML pages on the backend or on a local device for upload. 

2.  Make a react-style front-end SPA thingey, and have it use an AJAX call to get data from JSON or something and render client-side. 

Ridiculous way to serve static content: 

3.  Make a react-style font-end SPA thingey and just write the static content straight into the code, rather than have to use an AJAX call.  (I've actually done this...)

AWESOME way to serve static content: 

4.  Take #3, but instead of writing the static content into the code, use a macro to fetch the static content from a much more readable and rational format, and then pass it to the front-end code. Because you have a lisp! And lisps can do that stuff!

This is a demo of that neat trick.  This is a front-end-only static page, and the way it works is that when the code is compiled, macro.clj steps in, grabs the json file, and passes it to the clojurescript for the front-end as data, which then gets built right into the generated javascript. No AJAX calls required.  But you still get separation of code and data.  And you don't have to generate individual static pages. 

