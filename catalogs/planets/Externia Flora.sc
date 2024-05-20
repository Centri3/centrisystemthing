Moon	"Flora/Externia III"
{
	ParentBody     "Externia-Clulesc bar"
	Class          "Aquaria"
	Mass            0.0165
	Radius          2.01e+03
	InertiaMoment   0.369
	RotationPeriod  4.5e+03
	RotationEpoch   0
	Obliquity       -5
	EqAscendNode    8.24

	EndogenousHeating 0
	Albedo          0.82
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Exotic"
		Type    "Multicellular"
		Biome   "Terrestrial"
	}

	Surface
	{
		Preset         "externia_flora.cfg"
		SurfStyle       0.374
		Randomize      (-0.180, 0.723, -0.929)
		colorDistMagn   0.0661
		colorDistFreq   229
		detailScale     128
		drivenDarkening 0
		seaLevel        0.191
		snowLevel       2
		tropicLatitude  1
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   0.45
		climateEquator  0.58
		climateSteppeMin 0.756
		climateSteppeMax 1
		climateForestMin 0.832
		climateForestMax 1
		climateGrassMin  0.74
		climateGrassMax  1
		humidity        0.664
		heightTempGrad  0.702
		beachWidth      0.00131
		tropicWidth     0.5
		mainFreq        1.07
		venusFreq       0.336
		venusMagn       0.649
		mareFreq        0.601
		mareDensity     0.153
		terraceProb     0.303
		erosion         0.119
		montesMagn      0.05
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      5
		riversFreq      5
		riversSin       7
		riftsMagn       100
		riftsFreq       7
		riftsSin        7
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      1
		cracksFreq      1
		cracksOctaves   15
		craterMagn      1
		craterFreq      5
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.4
		volcanoFreq     2
		volcanoDensity  0.336
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.397
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     2.1
		cycloneFreq     0.841
		cycloneDensity  0.306
		cycloneOctaves  3
		BumpHeight      6
		BumpOffset      1.42
		DiffMapAlpha   "Water"
		SpecBrightWater 2
		SpecBrightIce   0.1
		RoughnessWater  0.511
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.229
		RoughnessScale  1.19
		Hapke           0.5
		SpotBright      1.33
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           1.14
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			He        	100
		}
	}

	Clouds
	{
		Height          3.61
		Velocity        100
		BumpHeight      0.408
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateColor  (0.801 0.921 1.000)
		ModulateBright  1
		Opacity         0.534
		mainFreq        3
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          3.61
		Velocity        110
		BumpHeight      0.504
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateColor  (0.910 0.688 1.000)
		ModulateBright  1
		Opacity         0.29
		mainFreq        3
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          3.61
		Velocity        120
		BumpHeight      0.408
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateColor  (1.000 0.844 0.844)
		ModulateBright  1
		Opacity         0.489
		mainFreq        3
		mainOctaves     0
		Coverage        0.74
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Externia Flora"
		Height          20
		Density         7.31
		Pressure        35
		Greenhouse      0.001
		Bright          5
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			He        	100
		}
	}

	Climate
	{
		GlobalWindSpeed  5.15
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      580.030354
		SemiMajorAxisKm 37696007
		Eccentricity    0.001
		Inclination     0.003
		AscendingNode   2.7480916
		ArgOfPericenter 79.6946565
		MeanAnomaly     0
	}
}

