DwarfPlanet	"Rex/Lercurnis I LT.1"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Aquaria"
	Mass            0.00789
	Radius          1.56e+03
	InertiaMoment   0.38
	Oblateness      0.00208
	RotationPeriod  178
	RotationEpoch   1451545
	Obliquity       68.7
	EqAscendNode    11.4

	EndogenousHeating 0.00292
	Albedo          0.86
	Brightness      1
	BrightnessReal  1
	Color          (0.587 0.545 0.477)

	Surface
	{
		Preset         "lercurnis_verna_lt_rex.cfg"
		SurfStyle       0.717
		Randomize      (-0.772, 0.778, -0.436)
		colorDistMagn   0.0799
		colorDistFreq   273
		detailScale     128
		drivenDarkening 0
		seaLevel        0.58
		snowLevel       1.2
		tropicLatitude  0.0219
		icecapLatitude  0.779
		icecapHeight    0
		climatePole     1
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.471
		heightTempGrad  0.625
		beachWidth      0.0014
		tropicWidth     0.07
		mainFreq        2.67
		venusFreq       0.83
		venusMagn       0.305
		mareFreq        1
		mareDensity     0.145
		terraceProb     0.199
		erosion         0
		montesMagn      0.03
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0362
		dunesFreq       0
		dunesFraction   0.594
		hillsMagn       0.05
		hillsFreq       500
		hillsFraction   1
		hills2Fraction  1
		riversMagn      13
		riversFreq      2.9
		riversSin       6.49
		riftsMagn       15
		riftsFreq       10
		riftsSin        10
		canyonsMagn     0.532
		canyonsFreq     0.742
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      2
		cracksOctaves   15
		craterMagn      3
		craterFreq      2
		craterDensity   1
		craterOctaves   6
		craterRayedFactor 0
		volcanoMagn     0.344
		volcanoFreq     2
		volcanoDensity  0.237
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     0.848
		cycloneFreq     0.928
		cycloneDensity  0.365
		cycloneOctaves  0
		BumpHeight      20.2
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.1
		RoughnessWater  0.399
		RoughnessIce    0.234
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.7
		SpotBright      1.52
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          11.1
		Velocity        45
		BumpHeight      0.854
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0
		ModulateBright  1
		Opacity         0.733
		mainFreq        0.847
		mainOctaves     0
		Coverage        0.519
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          11.1
		Velocity        30
		BumpHeight      1.17
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateBright  1
		Opacity         0.656
		mainFreq        0.847
		mainOctaves     0
		Coverage        0.519
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          11.1
		Velocity        15
		BumpHeight      0.768
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.956
		ModulateBright  1
		Opacity         0.656
		mainFreq        0.847
		mainOctaves     0
		Coverage        0.519
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Verna LT Rex"
		Height          209
		Density         2.48
		Pressure        0.651
		Greenhouse      96.3
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			N2        	99.7
			C2H6      	0.121
			CH4       	0.103
			C2H4      	0.052
			CO        	0.0163
			C2H2      	0.000418
			Ar        	0.000234
			O2        	0.000228
			CO2       	0.000199
			Ne        	0.000137
			NH3       	2.53e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  7.39
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          105.29563
		SemiMajorAxis   20.7411429
		Eccentricity    0.152671756
		Inclination     -2
		AscendingNode   -123.664122
		ArgOfPericenter 123.664122
		MeanAnomaly     100
	}
}

