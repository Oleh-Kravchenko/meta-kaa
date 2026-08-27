# meta-kaa

Yocto/OpenEmbedded layer containing recipes for my projects.

## Dependencies

This layer depends on:
* `core`

## Supported Yocto Releases

| Yocto Project release | Branch      |
| --------------------- | ----------- |
| Scarthgap             | `scarthgap` |

## Adding the Layer

Clone the repository into your Yocto/OpenEmbedded workspace:
```bash
git clone https://github.com/Oleh-Kravchenko/meta-kaa.git
```

Add the layer to your build configuration:
```bash
bitbake-layers add-layer /path/to/meta-kaa
```

Verify the configured layers:
```bash
bitbake-layers show-layers
```

## License

This layer is released under the MIT License.

See [LICENSE](LICENSE) for the full license text.

## Maintainer

Oleh Kravchenko [oleg@kaa.org.ua](mailto:oleg@kaa.org.ua)
