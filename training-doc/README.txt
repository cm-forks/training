Here are some interesting links regarding Scalate, jade, scamp and markdown

jade is the markup language defining the structure of the web pages
markdown (based on PERl) allows to specify content with simple keywords without having to deal with html syntax and format text
scalage is the tool used to generate web pages
princexml allows to convert html into pdf


Markdown : http://daringfireball.net/projects/markdown/syntax
Jade : http://jade-lang.com/
Scalate : http://scalate.fusesource.org/documentation/
PrinceXml : http://princexml.com/


Command to be used to launch the jetty web site under camel-cbr
***************************************************************
mvn org.mortbay.jetty:maven-jetty-plugin:run


Pigmentize
**********
sudo easy_install Pygments

To pigmentize the text,run the following command :
/usr/local/bin/pygmentize -f html -o index.html index.page




12/20/2010 -:- 04:08:46 PM] <charlesmoulliard> Where is define the syntax that we can use in xxx.page or .md ? I don't see a link on the scalate fusesource about that
[12/20/2010 -:- 04:10:06 PM] <jstrachan> markdown is defined here: http://daringfireball.net/projects/markdown/syntax
[12/20/2010 -:- 04:10:16 PM] <chirino> http://daringfireball.net/projects/markdown/syntax
[12/20/2010 -:- 04:10:18 PM] <chirino> :)
[12/20/2010 -:- 04:10:25 PM] <jstrachan> the .page file syntax is just key/value pairs really, have a look at some samples
[12/20/2010 -:- 04:10:38 PM] <chirino> page is like this: http://webgen.rubyforge.org/documentation/webgen_page_format.html
[12/20/2010 -:- 04:10:56 PM] <jstrachan> mostly its just about setting the page title & defining the pipeline (e.g. what syntaxes to use - you can choose what formats are used for different sections)
[12/20/2010 -:- 04:10:57 PM] <chirino> the Meta Information Block is in Yaml format
[12/20/2010 -:- 04:11:24 PM] <chirino> http://www.yaml.org/spec/1.2/spec.html
[12/20/2010 -:- 04:11:44 PM] <chirino> actually it's processed by SSP first, then loaded as yaml.
[12/20/2010 -:- 04:11:46 PM] <jstrachan> chirino we should probably hack up more docs & links on hacking up websites here... http://scalate.fusesource.org/documentation/siteGen.html
[12/20/2010 -:- 04:11:52 PM] <chirino> yeah
[12/20/2010 -:- 04:17:20 PM] <jstrachan> charlesmoulliard btw one big reason for using .page files rather than pure .conf files for example is the .conf files looses the title; in confluence the title is a String which is stored outside of the .conf file
[12/20/2010 -:- 04:19:18 PM] <charlesmoulliard> There is something that I don't understand. How the content inside the xxx.page is link to the stylesheet ? How can I add paragraph ?
[12/20/2010 -:- 04:20:43 PM] <jstrachan> typically most pages just have wiki markup and generate html; the layout usually is the thing which loads the stylesheet - seperately from the pages
[12/20/2010 -:- 04:21:35 PM] <jstrachan> though if you want you can disable the layout for a page and just have a full <html> <head>...</head> <body> ... </body></html> doc if you prefer
[12/20/2010 -:- 04:21:59 PM] <jstrachan> markdown doesn't have anything to generate html/head/body tags or include style sheets - but you can just use regular html for that
[12/20/2010 -:- 04:22:16 PM] <jstrachan> or use jade for the html markup then markdown for the wiki notation
[12/20/2010 -:- 04:23:33 PM] <jstrachan> chirino we should maybe make a few recommendations for static site gen; e.g. use .page files, prefer jade for html markup and markdown for wiki content etc
[12/20/2010 -:- 04:23:49 PM] <charlesmoulliard> What do you recommend when we plan to generate doc in hml/pdf for training purpose (so WIKIis required) ?
[12/20/2010 -:- 04:24:18 PM] <charlesmoulliard> so WIKI is not required
[12/20/2010 -:- 04:24:25 PM] <charlesmoulliard> sorry for the mistake
[12/20/2010 -:- 04:24:53 PM] <chirino> charlesmoulliard: use md
[12/20/2010 -:- 04:24:57 PM] <chirino> it's the simplest.
[12/20/2010 -:- 04:25:30 PM] <chirino> or .conf if your more familiar with the confluence wiki syntax


[12/20/2010 -:- 05:30:32 PM] <jstrachan> charlesmoulliard jade basically makes hacking html markup a joy; it hides all the pointy brackets and close tags; lets you just write concise markup
[12/20/2010 -:- 05:31:06 PM] <jstrachan> charlesmoulliard jade and markdown have no actual overlap; markdown is for text formatting, jade is for generating html markup with id/class attributes etc
[12/20/2010 -:- 05:31:17 PM] <jstrachan> charlesmoulliard so jade + markdown is a great combination
[12/20/2010 -:- 05:31:41 PM] <jstrachan> charlesmoulliard though feel free to omit the jade part of you are just writing  page of text which doesn't have much actual html markup in it (e.g. its just headings / paragraphs / formatting etc
[12/20/2010 -:- 05:31:56 PM] <jstrachan> chirino I think scalate maybe shouldn't escape = by default
[12/20/2010 -:- 05:33:06 PM] <charlesmoulliard> And when I would like to put text in a table, how do you that with jade + markdown ?
[12/20/2010 -:- 05:33:32 PM] <chirino> markdown can't do tables.. so jade is better for that.
[12/20/2010 -:- 05:33:40 PM] <jstrachan> jade does any html markup
[12/20/2010 -:- 05:33:42 PM] <jstrachan> table
[12/20/2010 -:- 05:33:43 PM] <jstrachan>  tr
[12/20/2010 -:- 05:33:48 PM] <jstrachan>    th Title1
[12/20/2010 -:- 05:33:51 PM] <jstrachan>  tr
[12/20/2010 -:- 05:33:56 PM] <jstrachan>    td some content
[12/20/2010 -:- 05:34:41 PM] <jstrachan> have a look at the layout sample in the stomp-spec to get the idea of how jade works; its basically using whitespace indentation to define blocks
[12/20/2010 -:- 05:37:21 PM] <charlesmoulliard> I will create a jade page
[12/20/2010 -:- 05:37:45 PM] <jstrachan> wonder if this might be handy for creating pdfs from markdown/markup http://johnmacfarlane.net/pandoc/markdown2pdf.1.html
[12/20/2010 -:- 05:37:53 PM] <jstrachan> turning html into pdfs?
[12/20/2010 -:- 05:37:59 PM] <jstrachan> never tried it mind you
[12/20/2010 -:- 05:39:44 PM] <charlesmoulliard> Can we combine markdown syntax with jade in xx.jade page ?
[12/20/2010 -:- 05:41:30 PM] <chirino> yes.
[12/20/2010 -:- 05:41:59 PM] <jstrachan> html
[12/20/2010 -:- 05:42:00 PM] <jstrachan>  body
[12/20/2010 -:- 05:42:10 PM] <jstrachan>    :markdown this is **some** text
[12/20/2010 -:- 05:42:17 PM] <chirino> charlesmoulliard: here's an example: https://github.com/scalate/scalate/blob/master/scalate-website/src/main/webapp/documentation/index.page
[12/20/2010 -:- 05:42:18 PM] <jstrachan> thats a jade page using markdown
[12/20/2010 -:- 05:42:39 PM] <chirino> actually that's a bad example.. thats markdown in jade in page :)
[12/20/2010 -:- 05:42:52 PM] <jstrachan> .left is jade/scaml syntax for <div id="left"> .... </div>
[12/20/2010 -:- 05:43:16 PM] <jstrachan> sorry <div class="left">...</div>
[12/20/2010 -:- 05:43:31 PM] <jstrachan> #left is jade/scaml syntax for <div id="left"> .... </div>
[12/20/2010 -:- 05:43:55 PM] <jstrachan> using the css notation for id/class names (#foo and .foo respectively)
[12/20/2010 -:- 05:45:10 PM] <chirino> I think this is a really awesome example of jade in action: https://github.com/stomp/stomp-spec/blob/master/src/implementations.page
[12/20/2010 -:- 05:45:37 PM] <chirino> I generates this page: http://stomp.github.com/implementations.html
[12/20/2010 -:- 05:45:46 PM] <chirino> notice the table in that page.
[12/20/2010 -:- 05:46:03 PM] <jstrachan> agreed!
[12/20/2010 -:- 05:46:31 PM] <jstrachan> charlesmoulliard its a tad complex in that the jade table section defines a macro (a scala function) to wrap up the generation of a table row to make the wiki document simpler
[12/20/2010 -:- 05:46:41 PM] <chirino> to avoid repeating the tr td stuff.. we create a little inline fuction called language at line 52
[12/20/2010 -:- 05:46:44 PM] <jstrachan> the "- def language" bit
[12/20/2010 -:- 05:46:45 PM] <jstrachan> yeah
[12/20/2010 -:- 05:46:51 PM] <chirino> which we just reuse


12/20/2010 -:- 05:53:05 PM] <charlesmoulliard> This function -->  - def language(name:String)(func: =>Unit) ?
[12/20/2010 -:- 05:53:27 PM] <jstrachan> yeah - thats some scala code defining a function
[12/20/2010 -:- 05:53:42 PM] <jstrachan> in jade/scaml lines beginning with - are a scala statement
[12/20/2010 -:- 05:54:10 PM] <jstrachan> e.g. the following is a jade page...- for (p <- people)
[12/20/2010 -:- 05:54:21 PM] <jstrachan> - for (p <- people)
[12/20/2010 -:- 05:54:29 PM] <jstrachan>  li #{p.name}
[12/20/2010 -:- 05:54:37 PM] <jstrachan> the li was meant to be indented :)
[12/20/2010 -:- 05:54:42 PM] <jstrachan> typing jade into irc is tricky :)
[12/20/2010 -:- 05:55:16 PM] <jstrachan> chirino we could do with a nice jade page showing how awesome it is :)
[12/20/2010 -:- 05:55:26 PM] <jstrachan> chirino pushing the jade + markdown angle
[12/20/2010 -:- 05:55:43 PM] <jstrachan> the jade page is a bit underwhelming http://scalate.fusesource.org/documentation/scaml-reference.html#jade
[12/20/2010 -:- 05:56:11 PM] <chirino> jstrachan: yeah
[12/20/2010 -:- 05:56:29 PM] <chirino> charlesmoulliard: we are throwing alot at you
[12/20/2010 -:- 05:56:35 PM] <jstrachan> charlesmoulliard here's a little jade page showing how to make a bullet list for each person in a list https://gist.github.com/748634
[12/20/2010 -:- 05:56:38 PM] <chirino> not sure how much is sticking..
[12/20/2010 -:- 05:56:52 PM] <jstrachan> - means scala statement, = means output a scala expression
[12/20/2010 -:- 05:57:11 PM] <chirino> perhaps you should ignore the scala support in jade for now.

[12/20/2010 -:- 05:57:26 PM] <chirino> i.e. treat jade like explained in this page:
[12/20/2010 -:- 05:57:27 PM] <chirino> http://jade-lang.com/

[12/20/2010 -:- 05:57:35 PM] <charlesmoulliard> So this function iterates over each line e.g. language("c") and add the content into the column while the markdown format the second column (* [libstomp](http://stomp.codehaus.org/C) is an APR based c library) ?
[12/20/2010 -:- 05:57:45 PM] <chirino> yeah!
[12/20/2010 -:- 05:57:54 PM] <chirino> which is first converted to hmlt using markdown
[12/20/2010 -:- 05:58:09 PM] <chirino> since it's inside a :markdown block
[12/20/2010 -:- 05:58:32 PM] <jstrachan> charlesmoulliard note you don't have to use macros and scala code to benefit from jade/markdown - you can literally just use it as a wiki and not have any dynamic scala code in there if you like
[12/20/2010 -:- 05:59:42 PM] <charlesmoulliard> Thxs for your explanations. This seems clearer for me now. I think that I will adopt jade + markdown
[12/20/2010 -:- 05:59:50 PM] <jstrachan> charlesmoulliard e.g. here's a simple table in jade https://gist.github.com/748639

table
  tr
    th Name
    th Location
  tr
    td James
    td Mells
  tr
    td James
    td Tampa


[12/20/2010 -:- 06:00:39 PM] <chirino> it's a good combo.
[12/20/2010 -:- 06:01:12 PM] <chirino> charlesmoulliard: I recommend jusing markdown for all the prose and switching to jade when you need to layout or do fancy html stuff like tables.

12/20/2010 -:- 06:03:24 PM] <chirino> and this is an example why markdown is better for the copy: https://gist.github.com/748646

p
  | This is some text with a
  a(href="http://activemq.org") activemq
  link.

vs

This is some text with a [activemq](http://activemq.org) link.

[12/20/2010 -:- 06:03:46 PM] <chirino> the top and bottom produce the same thing. but the markdown is much more concise.
[12/20/2010 -:- 06:03:47 PM] <jstrachan> yeah :) hopefully we'll soon have loads of examples of scalate generating docs (rider, hawt*.fusesource.org, scalate, camel, activemq, karaf, servicemix, FON etc)

INF/scalate/layouts like defaut.jade will be processed during html generation ?
[12/22/2010 -:- 09:37:58 AM] <jstrachan> yes; if you don't specify a "layout" attribute, then it will pick WEB-INF/scalate/layouts/default.* as the template to do the layout
[12/22/2010 -:- 09:38:30 AM] <jstrachan> in a template you can specify the layout if you like with the scala code: attributes("layout") = "WEB-INF/scalate/layouts/myOtherLayout.scaml" or whatever
[12/22/2010 -:- 09:53:18 AM] <charlesmoulliard> ok
[12/22/2010 -:- 09:56:43 AM] <charlesmoulliard> What is the meaning of ? --> !~~ spot, !~~ body, !~~ blog in defaut.jade page of stomp ?
[12/22/2010 -:- 10:04:00 AM] <jstrachan> its a scaml/jade syntax for include the expression but don't escape any of the content
[12/22/2010 -:- 10:04:28 AM] <jstrachan> i.e. preserve any special markup characters like x < y comes out as x < y in HTML text not as x &lt; y
[12/22/2010 -:- 10:05:02 AM] <jstrachan> http://scalate.fusesource.org/documentation/scaml-reference.html#unescaping_html
[12/22/2010 -:- 10:05:43 AM] <jstrachan> it also avoids the indentation which occurs usually by default in scaml/jade
[12/22/2010 -:- 10:05:43 AM] <jstrachan> http://scalate.fusesource.org/documentation/scaml-reference.html#tilde-tilde
[12/22/2010 -:- 10:33:13 AM] <charlesmoulliard> Where is defined the content of spot , body or blog ?
[12/22/2010 -:- 10:34:56 AM] <jstrachan> huh?
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>    - if (spot!=null)
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>      div#spot
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>        div.wrapper
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>          !~~ spot
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>    - if (body!=null)
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>      div#content
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>        div.wrapper
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>    - if (blog!=null)
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>      div#blog
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>        div.wrapper
[12/22/2010 -:- 10:36:19 AM] <charlesmoulliard>          !~~ blog
[12/22/2010 -:- 10:38:07 AM] <jstrachan> they look like being attributes/parameters to the template
[12/22/2010 -:- 10:38:31 AM] <jstrachan> see the binding attributes docs: http://scalate.fusesource.org/documentation/scaml-reference.html#bindings
[12/22/2010 -:- 10:39:03 AM] <jstrachan> basically they are passed in from the template being laid out