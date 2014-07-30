package org.jetbrains.cabal.parser

import com.intellij.psi.tree.IElementType

public val FIELD_TYPES: Map<String, IElementType> = mapOf(
         "version"              to CabalTokelTypes.VERSION           ,
         "cabal-version"        to CabalTokelTypes.CABAL_VERSION     ,
         "name"                 to CabalTokelTypes.NAME_FIELD        ,
         "build-type"           to CabalTokelTypes.BUILD_TYPE_FIELD  ,
         "license"              to CabalTokelTypes.LICENSE           ,
         "tested-with"          to CabalTokelTypes.TESTED_WITH       ,
         "license-file"         to CabalTokelTypes.LICENSE_FILES     ,
         "license-files"        to CabalTokelTypes.LICENSE_FILES     ,
         "data-dir"             to CabalTokelTypes.DIRECTORY_FIELD   ,
         "main-is"              to CabalTokelTypes.MAIN_FILE         ,
         "build-depends"        to CabalTokelTypes.BUILD_DEPENDS     ,
         "pkgconfig-depends"    to CabalTokelTypes.PKG_CONFIG_DEPENDS,
         "build-tools"          to CabalTokelTypes.BUILD_TOOLS       ,
         "buildable"            to CabalTokelTypes.BUILDABLE         ,
         "extensions"           to CabalTokelTypes.EXTENSIONS        ,
         "other-modules"        to CabalTokelTypes.OTHER_MODULES     ,
         "exposed-modules"      to CabalTokelTypes.EXPOSED_MODULES   ,
         "exposed"              to CabalTokelTypes.EXPOSED           ,
         "test-module"          to CabalTokelTypes.TEST_MODULE       ,
         "type"                 to CabalTokelTypes.TYPE              ,
         "module"               to CabalTokelTypes.REPO_MODULE       ,
         "tag"                  to CabalTokelTypes.REPO_TAG          ,
         "location"             to CabalTokelTypes.REPO_LOCATION     ,
         "hs-source-dirs"       to CabalTokelTypes.HS_SOURCE_DIRS    ,
         "hs-source-dir"        to CabalTokelTypes.HS_SOURCE_DIRS    ,
         "maintainer"           to CabalTokelTypes.PROPERTY          ,
         "package-url"          to CabalTokelTypes.PROPERTY          ,
         "homepage"             to CabalTokelTypes.PROPERTY          ,
         "bug-reports"          to CabalTokelTypes.PROPERTY          ,
         "extra-doc-files"      to CabalTokelTypes.PROPERTY          ,
         "extra-tmp-files"      to CabalTokelTypes.PROPERTY          ,
         "data-files"           to CabalTokelTypes.PROPERTY          ,
         "extra-source-files"   to CabalTokelTypes.PROPERTY          ,
         "includes"             to CabalTokelTypes.PROPERTY          ,
         "install-includes"     to CabalTokelTypes.PROPERTY          ,
         "c-sources"            to CabalTokelTypes.PROPERTY          ,
         "copyright"            to CabalTokelTypes.PROPERTY          ,
         "author"               to CabalTokelTypes.PROPERTY          ,
         "stability"            to CabalTokelTypes.PROPERTY          ,
         "synopsis"             to CabalTokelTypes.PROPERTY          ,
         "description"          to CabalTokelTypes.PROPERTY          ,
         "category"             to CabalTokelTypes.PROPERTY          ,
         "ghc-options"          to CabalTokelTypes.PROPERTY          ,
         "ghc-prof-options"     to CabalTokelTypes.PROPERTY          ,
         "ghc-shared-options"   to CabalTokelTypes.PROPERTY          ,
         "hugs-options"         to CabalTokelTypes.PROPERTY          ,
         "nhc98-options"        to CabalTokelTypes.PROPERTY          ,
         "cc-options"           to CabalTokelTypes.PROPERTY          ,
         "cpp-options"          to CabalTokelTypes.PROPERTY          ,
         "ld-options"           to CabalTokelTypes.PROPERTY          ,
         "branch"               to CabalTokelTypes.PROPERTY          ,
         "frameworks"           to CabalTokelTypes.PROPERTY          ,
         "extra-libraries"      to CabalTokelTypes.PROPERTY          ,
         "subdir"               to CabalTokelTypes.PROPERTY          ,
         "extra-lib-dirs"       to CabalTokelTypes.PROPERTY          ,
         "include-dirs"         to CabalTokelTypes.PROPERTY          ,
         "default"              to CabalTokelTypes.PROPERTY          ,
         "manual"               to CabalTokelTypes.PROPERTY
)