import SwiftUI
import shared

struct ContentView: View {
	var body: some View {
        VStack {
            Image(resource: \.kermit)
                .resizable()
                .aspectRatio(1920/1395, contentMode: .fit)
            Strings().get(id: SharedRes.strings().hello_world, args: [])
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
