Planet	"Sedima/Lercurnis B VI"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            0.24129
	Radius          4204.3
	InertiaMoment   0.32947
	Obliquity       2.5244
	EqAscendNode    167.82
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.775 0.772 0.769)

	Surface
	{
		Preset         "ferria_arid_yellow_blue_plants.cfg"
		SurfStyle       0.92054
		Randomize      (-0.259, -0.151, 0.107)
		colorDistMagn   0.077479
		colorDistFreq   398.22
		detailScale     16384
		drivenDarkening 0
		seaLevel        0.16859
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.61701
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.5625
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.22822
		heightTempGrad  0.375
		beachWidth      0.001026
		tropicWidth     0.5
		mainFreq        1.3007
		venusFreq       1.034
		venusMagn       0
		mareFreq        1.9571
		mareDensity     0.16473
		terraceProb     0.20679
		erosion         0
		montesMagn      0.20133
		montesFreq      187.14
		montesSpiky     0.92466
		montesFraction  0.051692
		dunesMagn       0.063365
		dunesFreq       41.389
		dunesFraction   0.11654
		hillsMagn       0.11889
		hillsFreq       593.07
		hillsFraction   0
		hills2Fraction  0
		riversMagn      0
		riversFreq      3.3321
		riversSin       5.6898
		riftsMagn       65.451
		riftsFreq       3.1667
		riftsSin        6.7787
		canyonsMagn     0.026375
		canyonsFreq     115.75
		canyonsFraction 0
		cracksMagn      0.077234
		cracksFreq      0.49075
		cracksOctaves   0
		craterMagn      0.65817
		craterFreq      12.557
		craterDensity   0.25749
		craterOctaves   7
		volcanoMagn     0.67791
		volcanoFreq     0.76917
		volcanoDensity  0.22001
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.28736
		volcanoRadius   0.65425
		volcanoTemp     247.41
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.94637
		cycloneDensity  0.38158
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      2.2222
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          15.841
		Velocity        136.23
		BumpHeight      2.9205
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.73082
		mainOctaves     10
		Coverage        0.16035
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ge"
		Height          206.53
		Density         0.083913
		Pressure        0.1
		Greenhouse      25
		Bright          10
		Opacity         1
		SkyLight        3.3333
		Hue             0
		Saturation      1

		Composition
		{
			CO2       	100
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          0.12825
		SemiMajorAxis   0.109581135
		Eccentricity    0.244274809
		Inclination     1
		AscendingNode   305.038168
		ArgOfPericenter -255.572519
		MeanAnomaly     0
	}
}

