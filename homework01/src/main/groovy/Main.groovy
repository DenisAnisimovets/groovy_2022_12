import com.google.common.base.Joiner

println("Hellow Otus")
def list = ['hello', 'world']
def joined = Joiner.on(', ').join(list)
println(joined)

