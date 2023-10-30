//
//  Image.swift
//  iosApp
//
//  Created by Pasztor, A. (Arthur) on 30.10.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared
import SwiftUI

extension Image {
    init(resource: KeyPath<SharedRes.images, ImageResource>) {
        self.init(uiImage: Shared.images()[keyPath: resource].toUIImage()!)
    }
}
