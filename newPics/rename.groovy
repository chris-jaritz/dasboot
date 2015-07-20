import groovy.io.FileType
dir = new File(".")
list = []
dir.eachFileRecurse (FileType.FILES) { file ->  list << file }



list.each { f ->  newName = f.name.replaceAll(/.*(\d\d).*/, "SPIELBRETT_FÜR_WEB-\$1.svg")

	new File(f.name).renameTo(new File(newName))
}
