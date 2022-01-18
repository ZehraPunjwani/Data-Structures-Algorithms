from urllib.request import urlopen

class Link(HTMLParser):
	def _init_(self):
		HTMLParser._init_(self)
		self.link = []
		
	def handle_starttag(self, tag, attr):
		if tag == "a":
			for attr_name, attr_value in attrs:
				if k == "href":
					print(attr_value)

def spider(start_url):
	todo = [start_url]
	while len(todo) > 0:
		nl = todo[-1]
		del todo[-1]
		
		bu  list(urlparse(n1))
		
	d = urlopen(url)
	l = Link()
	l.feed(str(d.read())
	print(l.links)
spider = ("http://www.kcl.ac.uk/")

