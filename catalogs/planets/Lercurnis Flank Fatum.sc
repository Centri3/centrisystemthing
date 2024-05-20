Moon	"Fatum/Lercurnis III I"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.03
	Radius          2.37e+03
	InertiaMoment   0.352
	Oblateness      0.00515
	Obliquity       0
	EqAscendNode    -157
	TidalLocked     true

	EndogenousHeating 0
	Albedo          0.7
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_fatum.cfg"
		SurfStyle       0.674
		Randomize      (-0.396, -0.151, -0.150)
		colorDistMagn   0.0886
		colorDistFreq   297
		detailScale     128
		drivenDarkening 0
		seaLevel        0.00799
		snowLevel       1.34
		tropicLatitude  0.291
		icecapLatitude  0.458
		icecapHeight    0.0611
		climatePole     1
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        1
		heightTempGrad  0.625
		beachWidth      0.001
		tropicWidth     0.07
		mainFreq        2.18
		venusFreq       1.65
		venusMagn       1
		mareFreq        1.47
		mareDensity     0
		terraceProb     0.229
		erosion         0.0458
		montesMagn      0.5
		montesFreq      65
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0.4
		riversFreq      10
		riversSin       5
		riftsMagn       34.4
		riftsFreq       3
		riftsSin        5
		canyonsMagn     0.0221
		canyonsFreq     72.7
		canyonsFraction 0.666
		cracksMagn      0.1
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.374
		volcanoFreq     1.22
		volcanoDensity  0.374
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.458
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.77
		stripeTwist     0.39
		cycloneMagn     1.96
		cycloneFreq     0.871
		cycloneDensity  0.397
		cycloneOctaves  0
		BumpHeight      20
		BumpOffset      0.153
		DiffMapAlpha   "Water"
		SpecBrightWater 1
		SpecBrightIce   0.1
		RoughnessWater  0.489
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.27
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Depth           0.16
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			O2        	100
			N2        	0.0029
		}
	}

	Clouds
	{
		Height          22.4
		Velocity        30
		BumpHeight      2.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.605 0.861 1.000)
		ModulateBright  1
		Opacity         0.29
		mainFreq        1.4
		mainOctaves     0
		Coverage        0.443
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          22.4
		Velocity        40
		BumpHeight      3.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.461 0.545 1.000)
		ModulateBright  1
		Opacity         0.229
		mainFreq        1.4
		mainOctaves     0
		Coverage        0.443
		stripeZones     1.77
		stripeTwist     0.39
	}

	Clouds
	{
		Height          22.4
		Velocity        50
		BumpHeight      4.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		SubsurfScatBright 1
		SubsurfScatPower  100
		RingsWinter     0
		ModulateColor  (0.480 0.927 1.000)
		ModulateBright  1
		Opacity         0.244
		mainFreq        1.4
		mainOctaves     0
		Coverage        0.443
		stripeZones     1.77
		stripeTwist     0.39
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Flank Fatum"
		Height          80
		Density         3.93
		Pressure        0.371
		Greenhouse      5
		Bright          7
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1

		Composition
		{
			O2        	99.9
			N2        	0.0894
		}
	}

	Climate
	{
		GlobalWindSpeed  6.34
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1.09582466
		SemiMajorAxisKm 90000
		Eccentricity    0.0002
		Inclination     0
		AscendingNode   -156.641221
		ArgOfPericenter 167.633588
		MeanAnomaly     151.145038
	}
}

